package com.sohilladhani.anttargets;

import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.Path;

import com.sohilladhani.anttasks.JavacTask;

public class CompileTarget {
	public CompileTarget(Project p, String srcDir, String destDir, Path classPath){
		new JavacTask(p,srcDir,destDir,classPath);		
	}
}
