package com.sohilladhani.anttasks;

import java.io.File;

import org.apache.tools.ant.taskdefs.War;
import org.apache.tools.ant.types.FileSet;

public class CreateWarTask extends War{
	public CreateWarTask(FileSet warFileSet, String webXml, String destFile){
		this.addFileset(warFileSet);
		this.setWebxml(new File(webXml));
		this.setDestFile(new File(destFile));
		this.init();
	}
}
