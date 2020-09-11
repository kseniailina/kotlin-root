package KotlinRoot_KotlinSubpr.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object KotlinRoot_KotlinSubpr_HttpsGithubComKseniailinaKotlinSubprGitRefsHeadsMaster : GitVcsRoot({
    uuid = "7b240984-7342-449e-be42-005b69aeaf3f"
    name = "https://github.com/kseniailina/kotlin-subpr.git#refs/heads/master"
    url = "https://github.com/kseniailina/kotlin-subpr.git"
    authMethod = password {
        userName = "kseniailina"
        password = "credentialsJSON:f32a7506-2f38-49a7-be7d-1f2d431cc2f5"
    }
})
