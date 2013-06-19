# Apphance Android HelloWorld Example

This repository contains a working example of uTest Apphance in a very simple Android app. 
To build this project you have a few choices:

1. Build by Ant
2. Build my Maven
3. Build manually within your IDE

Whichever method you choose, there are some preparation steps:

## Preparation Steps - obtaining uTest Apphance License Key

### 1. Create a free account with uTest Apphance

Get started by visiting the [Apphance website](http://www.apphance.com) and clicking "Sign Up". Follow the process to sign up for an account by entering your information and choosing a password.

### 2. Add a new application within Apphance

If you just registered for a new account in step 1, you'll be taken to this step automatically. Alternatively, click the application drop down on the upper right-hand corner of the screen and choose "Add New".

Tell Apphance the name of your application and the platform on which it runs (iOS, Android, or Windows Phone).

### 3. Copy the Application Key

Once you've added a new application in Apphance, you'll be given a unique application key. You'll need to add this to your code in just a few minutes, so keep it readily available. (You can always retrieve this key later if you need it. It's available in the Apphance web panel within the "Settings" menu on the left.)

## Instalation Steps

### 4. Download or clone this git repository to your local computer

You can either clone this repository or download a zip file - whichever works for you.
You can import project to your favourite IDE (e.g. Eclipse or Android Studio) or decide to build app from command line by Ant or Maven.

### 5. Open the MainActivity file

Find a MainActivity class. 

### 7. Place your app key in the MainActivity

Locate a line that looks like:

	public static final String APP_KEY = "Your-Apphance-Application-Key-Goes-Here";

Replace the string *Your-Apphance-Application-Key-Goes-Here* with the application key from Step 3.

### 8. Compile and run your app

#### Ant
	ant debug
	adb install bin/apphance-integration-sample-debug.apk

#### Maven:

First install dependencies:
	cd libs_mvn
	mvn install:install-file -Dfile=apphance-library-1.9.jar -DgroupId=com.apphance.android -DartifactId=apphance-library -Dpackaging=jar -Dversion=1.9
	mvn install:install-file -Dfile=apphance-library-1.9.apklib -DgroupId=com.apphance.android -DartifactId=apphance-library -Dpackaging=apklib -Dversion=1.9


Then build and run app:
	mvn clean install
	adb install target/helloworld-apphance-integration-1.0.apk 

#### IDE
Import project to you favourite IDE and run it

For more help, take a look at our online instructions for configuring [Apphance with your Android apps](http://help.apphance.com/library-installation/android/).

## Manifest File

There are several additional Apphance settings in the manifest file as well. You can review these settings by opening AndroidManifest.xml from your project. For more information about the content of the manifest, please visit the [Android Pre-Production Library Tutorial](http://help.apphance.com/library-installation/android/tutorial-pre-production)

## Getting More Help

For more information about using Apphance, visit our online [help topics](http://help.apphance.com).  

If you have additional questions, email us at: [help@apphance.com](mailto:help@apphance.com)

## What is uTest Apphance?

uTest Apphance enables mobile developers to know precisely how their apps are working in the test lab and in the wild. A single library enables over-the-air app distribution, crash reports, in-app bug reports and user feedback. Now developers can discover in real time precisely what’s working – and what’s not – with their iOS, Android, Windows Phone, Kindle Fire and Nook apps. Learn more by visiting [apphance.com](http://www.apphance.com).
