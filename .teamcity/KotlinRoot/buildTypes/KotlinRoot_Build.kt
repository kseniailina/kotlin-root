package KotlinRoot.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.freeDiskSpace
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object KotlinRoot_Build : BuildType({
    uuid = "86c2364d-a981-492d-b403-5c977f6956e1"
    name = "Build"

    vcs {
        root(KotlinRoot.vcsRoots.KotlinRoot_HttpsGithubComKseniailinaKotlinRootGitRefsHeadsMaster)
    }

    triggers {
        vcs {
        }
    }

    features {
        freeDiskSpace {
            failBuild = false
        }
    }
})
