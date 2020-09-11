package KotlinRoot_KotlinSubpr.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object KotlinRoot_KotlinSubpr_Build : BuildType({
    uuid = "a1cc3109-bb89-4e73-ac1a-ad88600c1e17"
    name = "Build"

    vcs {
        root(KotlinRoot_KotlinSubpr.vcsRoots.KotlinRoot_KotlinSubpr_HttpsGithubComKseniailinaKotlinSubprGitRefsHeadsMaster)
    }

    steps {
        script {
            scriptContent = """echo "hello""""
        }
    }

    triggers {
        vcs {
        }
    }
})
