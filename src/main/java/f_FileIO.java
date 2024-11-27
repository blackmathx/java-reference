import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class f_FileIO {
    public static void run() {
        System.out.println("\n======= FileIO =================\n");

        String root = "";

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("win")) {
            System.out.println("Windows filesystem detected.");
            root = "C:\\Development\\temp";
        } else if (osName.contains("nix") || osName.contains("nux") || osName.contains("aix")) {
            System.out.println("Linux/Unix filesystem detected.");
            root = "/tmp";
        } else {
            System.out.println("Unknown filesystem.");
            System.exit(0);
        }

        System.exit(0); // TODO review the class for correctness




        // Old java.io.File has drawbacks so Java7 brought the NIO.2 package, the
        // java.nio.file.Path interface. Path represents a path to a file, directory,
        // or link (*nix systems). Another class is java.nio.file.FileSystem.


        // One way to get a Path is use FileSystem's getPath method Path p = FileSystems.getDefault().getPath("C:\temp");
        // But java.nio.file.Paths has a shortcut to create a path. Path textfile = Paths.get(Path path);
        // Note that Path is not a physical file or directory, use Files utilities for this instead.


        Path path1 = Paths.get(root);
        System.out.println("path: " + path1);
        System.out.println("path name count: " + path1.getNameCount()); // elements in the path
        System.out.println("path index 0: " + path1.getName(0)); // prints Development
        System.out.println("path index 1: " + path1.getName(1)); // prints tempFileIO
        System.out.println("path parent: " + path1.getParent()); // prints the parent of tempFileIO, C:\Development
        System.out.println("path root: " + path1.getRoot());     // prints C:\
        System.out.println("path file: " + path1.getFileName()); // prints temp


        // Use java.nio.file.Files to handle files and directories (to work on a Path)
        // such as reading, writing to a file, create and delete a path
        // copy files, and check if a path exists.



        // Check if directory exists
        if(Files.isDirectory(path1)) {
            System.out.println("Directory exists");
        } else {
            System.out.println("Directory does not exist");
        }

        //System.exit(0);


        // Create directory
        try {
            Files.createDirectory(path1);
        } catch (FileAlreadyExistsException e) {
            System.out.println("Cannot create directory " + path1 + ", it already exists");
        } catch (Exception ex) {
            ex.printStackTrace();
        }


        // Create new sub-directory or delete if it exists
        Path p2 = Paths.get(root + "test\\");
        try {
            Files.createDirectory(p2);
        } catch (Exception e) {
            // exists so delete it
            System.out.println("Cannot create directory " + p2.toString() + ", so delete it");
            try {
                Files.deleteIfExists(p2); // Must be empty.
            } catch (DirectoryNotEmptyException ex) {
                // it won't delete. not empty?
            } catch (Exception exx) {
                // IOException or SecurityException
            }
        }


        // Retrieve files and sub-directories and symbolic links with newDirectoryStream
        // DirectoryStream<Path> newDirectoryStream(Path p) //  Must  be closed after use
        try (DirectoryStream<Path> children = Files.newDirectoryStream(path1)){
            System.out.println("printing children");
            for(Path child : children) {
                System.out.println(child);
            }
            children.close(); // Must be closed ?
        } catch (IOException e) {
            e.printStackTrace();
        }


        /////////////// ReadAndWriteFile ////////////////////////////////////////////////////////////////////

        Path settingsFile;

        // Copy and Move files. Use this copy method for ease of use:
        // public static Path copy(Path source, Path target, CopyOption... options) throws java.io.IOException
        // CopyOption is an intf, StandardCopyOption is an implementation with the following enums
        // ATOMIC_MOVE move as atomic file system operation
        // COPY_ATTRIBUTES copy attributes to the new file
        // REPLACE_EXISTING replace existing file if exists
        Path source = Paths.get(root + "\\settings.txt");
        Path target = Paths.get(root + "\\something\\settingsCopied.txt");
        //logger.debug(source.toString() + " >> " + target.toString());
        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            Files.move(target, source);
        } catch (IOException e) {
            //logger.debug("Exception if file already exists");
        }




        // Read the file example 1
        String text = null;
        settingsFile = source;
        try {
            // readAllBytes(Path p) returns byte[] array
            text = new String(Files.readAllBytes(settingsFile), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read the file: example 2
        List<String> list = Collections.emptyList();
        try {
            // readAllLines(Path p, Charset charset) throws IOException // returns List<String>
            list = Files.readAllLines(settingsFile, StandardCharsets.UTF_8);
            for(String str : list) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }





        // Write to file example 1
        Path writeFile = Paths.get(root + "\\writeToSettings.txt");
        Charset charset = StandardCharsets.US_ASCII;
        String line1 = "Easy to write to a file";
        String line2 = "More text";
        List<String> lines = Arrays.asList(line1, line2);
        try {
            if(Files.notExists(writeFile)) {
                //logger.debug("creating " + writeFile.toString());
                Files.createFile(writeFile);
            } else {
                //logger.debug("already exists " + writeFile.toString());
            }
            // StandardOpenOption provides APPEND, CREATE, READ, SYNC, WRITE, ....
            Files.write(writeFile, lines, charset);
        } catch (IOException ex) {
            ex.printStackTrace();
        }



        // Read back
        List<String> list2 = Collections.emptyList();
        try {
            // readAllLines(Path p, Charset charset) throws IOException // returns List<String>
            list2 = Files.readAllLines(writeFile, StandardCharsets.UTF_8);
            for(String str : list2) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



        ////////////////// Read And Write Using Streams /////////////////////////

        // IO streams are like pipes. There are inputStreams and outputStreams.
        // Since there are byte or character streams, each input/output has two streams.
        //
        // Reader - stream for reading characters
        // Write - stream for writing characters
        // InputStream - stream for reading bytes
        // OutputStream - stream for writing bytes
        //
        // You can write to any data source or destination, just construct the correct implementation.



        // Reading Binary Data - InputStream
        // //public static InputStream newInputStream(Path path, OpenOption.. options) throws IOException



    }
}
