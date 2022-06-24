package com.github.syrious.processingintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.syrious.processingintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
