# Toasty 
Simply Toasty Library 

> How to
To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories: # model level add 

	dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}

 Step 2. Add the dependency #app level add 

	dependencies {
	        implementation 'com.github.krushang06:tostey:Tag'
	}

That's it! The first time you request a project JitPack checks out the code, builds it and serves the build artifacts (jar, aar).
If the project doesn't have any GitHub Releases you can use the short commit hash or 'master-SNAPSHOT' as the version.
