To set Maven dependencies to Apphance Library, you have to install it in your local repository:

mvn install:install-file -Dfile=apphance-library-1.9.jar -DgroupId=com.apphance.android -DartifactId=apphance-library -Dpackaging=jar -Dversion=1.9
mvn install:install-file -Dfile=apphance-library-1.9.apklib -DgroupId=com.apphance.android -DartifactId=apphance-library -Dpackaging=apklib -Dversion=1.9