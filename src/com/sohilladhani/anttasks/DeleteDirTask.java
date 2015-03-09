package com.sohilladhani.anttasks;

import org.apache.tools.ant.Project;
import org.apache.tools.ant.Target;
import org.apache.tools.ant.taskdefs.Delete;
import org.apache.tools.ant.types.FileSet;

public class DeleteDirTask extends Delete {
		public DeleteDirTask(FileSet fileSet, Target owningTarget, Project owningProject){
			this.addFileset(fileSet); //the file set to delete
			this.setIncludeEmptyDirs(true); //deletes empty directories
			this.setQuiet(true); //doesn't show error if directory not found
			this.setOwningTarget(owningTarget); //set the target to which it belongs
			this.setProject(owningProject); //set the project to which it belongs
			this.init();
		}
}
