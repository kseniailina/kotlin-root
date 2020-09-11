package KotlinRoot_KotlinSubpr

import KotlinRoot_KotlinSubpr.buildTypes.*
import KotlinRoot_KotlinSubpr.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

const val REPOSITORY_NAME = "Kotlin Subpr changed name"

object Project : Project({
    uuid = "9710729e-3de6-461a-92e2-d0223762e836"
    id("KotlinRoot_KotlinSubpr")
    parentId("KotlinRoot")
    name = REPOSITORY_NAME

    vcsRoot(KotlinRoot_KotlinSubpr_HttpsGithubComKseniailinaKotlinSubprGitRefsHeadsMaster)

    buildType(KotlinRoot_KotlinSubpr_Build)
})
