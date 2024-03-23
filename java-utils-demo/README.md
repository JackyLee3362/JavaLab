# Java 手动编译

## 目录结构

```sh
src/com/example
---Main.java
---utils
   ---Helper.java
```

## 实验一

最简单的编译

```sh
# 进入项目
cd [项目名]

# 编译项目
javac -cp src -d out src/com/example/Main.java

# 运行项目
java -cp out com.example.Main

# 打包项目
# cf 中表示创建 jar 文件 f用来指定 jar 的文件名
# -C 指定 class 文件所在的目录
# . 这里表示打包整个 out 目录下的文件
jar cf target/d1.jar -C out/ .

# 如果要指定入口
jar cfe target/d1.jar com.example.Main -C out .
```

## 实验二

扁平的文件结构，编译后会变成层级结构

```sh
javac -cp out -d out src/*.java
```

## 实验三

带有中文类名，是否会编译错误

```sh
# 编译项目
javac -d out -cp src src/主类.java
# 运行项目
java -cp out 主类
```

## 实验四

编译带 lib 的场景

```sh
# 编译
javac -cp "src;lib/*" -d out src/HelloWorld.java
# 运行
java -cp "out;lib/*" HelloWorld
```

## 参考文献

[命令行编译运行Java项目 | Junying Shao's Blog](https://shaojunying.github.io/6644e3ad18df41f990932bcf62294e82.html)

[第1期：抛开IDE，了解一下javac如何编译 | 毛帅的博客](https://imshuai.com/using-javac)