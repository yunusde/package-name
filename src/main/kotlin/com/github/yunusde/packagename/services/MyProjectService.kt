package com.github.yunusde.packagename.services

import com.github.yunusde.packagename.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
