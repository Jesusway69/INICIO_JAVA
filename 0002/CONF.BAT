@ECHO OFF
CLS
SET CLASSPATH=.;.\libreria\*
SET JAVA_HOME=C:\Program Files\Java\jdk1.8.0_212
SET PATH=.;%JAVA_HOME%\bin;%PATH%
SET PROMPT=$D$_$$
java -version
PAUSE > NUL
CLS