package com.sohilladhani.antprojects;

import java.io.File;

import org.apache.tools.ant.Project;
import org.apache.tools.ant.Target;
import org.apache.tools.ant.taskdefs.Mkdir;


public class AntAPIDemoProject {

	public void runProject(){
		//Setting properties for development side files and directories
		String devDir = "dev/";
		//this.setProperty("dev.build.dir", "build");
		String dev_build_dir = devDir + "build/";
		//this.setProperty("dev.classes.dir", "classes");
		String dev_classes_dir = devDir + "classes/";
		//this.setProperty("dev.etc.dir", "etc");
		String dev_etc_dir = devDir + "etc/";
		//this.setProperty("dev.lib.dir", "lib");
		String dev_lib_dir = devDir + "lib/";
		//this.setProperty("dev.src.dir", "src");
		String dev_src_dir = devDir + "src/";
		//this.setProperty("dev.web.dir", "web");
		String dev_web_dir = devDir + "web/";
		//this.setProperty("dev.web.css.dir", "${dev.web.dir}/css");
		String dev_web_css_dir = devDir + dev_web_dir + "css/";
		//this.setProperty("dev.web.images.dir", "${dev.web.dir}/images");
		String dev_web_images_dir = devDir + dev_web_dir + "images/";
		//this.setProperty("dev.web.js.dir", "${dev.web.dir}/js");
		String dev_web_js_dir = devDir + dev_web_dir + "js/";
		//this.setProperty("dev.web.xml", "${dev.etc.dir}/web.xml");
		String dev_web_xml = devDir + dev_etc_dir + "web.xml"; 

		// Setting properties for deployment side files and directories
		//this.setProperty("deploy.dir", "deploy");
		String deploy_dir = "deploy/";
		//this.setProperty("deploy.css.dir", "${deploy.dir}/css");
		String deploy_css_dir = deploy_dir + "css/";
		//this.setProperty("deploy.images.dir", "${deploy.dir}/images");
		String deploy_images_dir = deploy_dir + "images/";
		//this.setProperty("deploy.js.dir", "${deploy.dir}/js");
		String deploy_js_dir = deploy_dir + "js/";
		//this.setProperty("deploy.webinf.dir", "${deploy.dir}/WEB-INF");
		String deploy_webinf_dir = deploy_dir + "WEB-INF/";
		//this.setProperty("deploy.webinf.classes.dir","${deploy.webinf.dir}/classes");
		String deploy_webinf_classes_dir = deploy_webinf_dir + "classes/";
		//this.setProperty("deploy.webinf.lib.dir", "${deploy.webinf.dir}/lib");
		String deploy_webinf_lib_dir = deploy_webinf_dir + "lib/";

		// Setting properties for container side directories
		//this.setProperty("apache.home.dir",	"F:/Apache-Tomcat-7.0.33/Installed/apache-tomcat-7.0.33");
		String apache_home_dir = "F:/Apache-Tomcat-7.0.33/Installed/apache-tomcat-7.0.33/";
		//this.setProperty("apache.webapps.dir", "${apache.home.dir}/webapps");
		String apache_webapps_dir = apache_home_dir + "webapps/";
		//this.setProperty("apache.lib.dir", "${apache.home.dir}/lib");
		String apache_lib_dir = apache_home_dir + "lib/";

		Project project = new Project();
		project.setName("project");
		project.setBaseDir(new File("F:/Eclipse/Workspace/Use_Ant_API"));
		project.setDefault("init");
		project.init();
		
		/******* "Init" target *******/ 
		Target initTarget = new Target();
		initTarget.setName("init");
		initTarget.setProject(project);
		//Creating necessary deployment side directories
		Mkdir dep_webinf_dir = new Mkdir();
		dep_webinf_dir.setDir(new File(deploy_webinf_dir));
		dep_webinf_dir.setProject(project);
		initTarget.addTask(dep_webinf_dir);
		
		Mkdir dep_webinf_classes_dir = new Mkdir();
		dep_webinf_classes_dir.setDir(new File(deploy_webinf_classes_dir));
		dep_webinf_classes_dir.setProject(project);
		initTarget.addTask(dep_webinf_classes_dir);
		
		Mkdir dep_webinf_lib_dir = new Mkdir();
		dep_webinf_lib_dir.setDir(new File(deploy_webinf_lib_dir));
		dep_webinf_lib_dir.setProject(project);
		initTarget.addTask(dep_webinf_lib_dir);
		
		project.addTarget("init",initTarget);
		project.executeTarget(project.getDefaultTarget());
	}
	
	public static void main(String[] args) {
		AntAPIDemoProject aadp = new AntAPIDemoProject();
		aadp.runProject();
	}
	
}
