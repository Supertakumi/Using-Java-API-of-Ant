package com.sohilladhani.anttasks;

import java.io.File;

import org.apache.tools.ant.taskdefs.Copy;
import org.apache.tools.ant.types.FileSet;

public class CopyFilesTask extends Copy{
	public CopyFilesTask(String srcFileSetDir, String destDir, String includePattern, String excludePattern){
		this.init();
		FileSet fileSet = new FileSet();
		fileSet.setDir(new File(srcFileSetDir));
		fileSet.setIncludes(includePattern);
		fileSet.setExcludes(excludePattern);
		this.setTodir(new File(destDir));
		this.addFileset(fileSet);	
	}
}
