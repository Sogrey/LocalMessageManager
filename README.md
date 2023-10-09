# LocalMessageManager

[![](https://jitpack.io/v/Sogrey/LocalMessageManager.svg)](https://jitpack.io/#Sogrey/LocalMessageManager)

> Fork from [inloop/LocalMessageManager: Simpler to use and faster alternative to LocalBroadcastManager](https://github.com/inloop/LocalMessageManager)
> And moved the old version code to another branch: [Sogrey/LocalMessageManager at eu.inloop.localmessagemanager](https://github.com/Sogrey/LocalMessageManager/tree/eu.inloop.localmessagemanager)

**Added support for Android X**


To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:
``` gradle
	dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
```
Step 2. Add the dependency
```  gradle
	dependencies {
	        implementation 'com.github.Sogrey:LocalMessageManager:Tag'
	}
```
