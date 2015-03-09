package com.sohilladhani.anttasks;

import java.io.File;

import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.Javac;
import org.apache.tools.ant.types.Path;

public class JavacTask extends Javac{
	public JavacTask(Project p, String srcDir, String destDir, Path classPath){
		this.init();
		this.setSrcdir(new Path(p, srcDir));
		this.setDestdir(new File(destDir));
		this.setCompiler("modern");
		this.setSource("1.5");
		this.setTarget("1.5");
		this.setClasspath(classPath);
	}
}
