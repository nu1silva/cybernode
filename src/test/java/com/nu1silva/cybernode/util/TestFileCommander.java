package com.nu1silva.cybernode.util;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class TestFileCommander {

    FileCommander fileCommander = new FileCommander();

    @Test(testName = "Create File Test")
    void testCreateFile() {
        fileCommander.CreateFile("/tmp", "sample.txt", "UTF-8", "Sample File Text");
        File f = new File("/tmp/sample.txt");

        Assert.assertTrue(f.exists());
    }

    @Test(testName = "Remove File Test")
    void testRemoveFile() {
        File f = new File("/tmp/sample.txt");
        fileCommander.RemoveFile("/tmp", "sample.txt");

        Assert.assertFalse(f.exists());
    }

}
