package com.sohilladhani.anttasks;

import java.io.File;

import org.apache.tools.ant.taskdefs.Mkdir;

public class MakeDirTask extends Mkdir{
	public MakeDirTask(String dir){
		this.setDir(new File(dir));
		this.init();
	}
}
