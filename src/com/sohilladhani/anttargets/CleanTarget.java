package com.sohilladhani.anttargets;

import java.util.ArrayList;

import org.apache.tools.ant.Project;
import org.apache.tools.ant.Target;
import org.apache.tools.ant.types.FileSet;

import com.sohilladhani.anttasks.DeleteDirTask;

public class CleanTarget extends Target {
	public CleanTarget(ArrayList<FileSet> fileSetList, Project owningProject){
		for(FileSet fileSet : fileSetList){
			new DeleteDirTask(fileSet, this, owningProject);
		}
	}
}
