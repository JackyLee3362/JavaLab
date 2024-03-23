# maven 中 pom.xml 文件的一些问题

## properties

```xml
<!-- 指定 java 编译器的版本，默认是 1.5 版本 -->
<!-- 但是这项主要是用于 ${java.version} 引用的 -->
<java.version>17</java.version>

<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>

<!-- Maven Java 编译器版本 -->
<maven.compiler.source>17</maven.compiler.source>
<maven.compiler.target>17</maven.compiler.target>

<!-- 指定 spring-boot 版本，没什么好说的 -->
<spring-boot.version>2.7.18</spring-boot.version>
```