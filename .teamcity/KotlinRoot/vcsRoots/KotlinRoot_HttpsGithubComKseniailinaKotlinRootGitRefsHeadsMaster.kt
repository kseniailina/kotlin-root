package KotlinRoot.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object KotlinRoot_HttpsGithubComKseniailinaKotlinRootGitRefsHeadsMaster : GitVcsRoot({
    uuid = "8c679a12-0944-4884-abd9-129235282187"
    name = "https://github.com/kseniailina/kotlin-root.git#refs/heads/master"
    url = "https://github.com/kseniailina/kotlin-root.git"
    authMethod = password {
        userName = "kseniailina"
        password = "credentialsJSON:f32a7506-2f38-49a7-be7d-1f2d431cc2f5"
    }
})
