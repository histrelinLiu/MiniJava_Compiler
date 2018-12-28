# MiniJava_Compiler
FDU CompilePJ Team : 刘瑞林 + 陈啸天

### 分工

##### 共同完成的部分 :
工具选择/架构设计
##### 刘瑞林:
```
Statement.g4
Expression.g4
Identifier.g4
Integet.g4
Reserved.g4
MyMiniJavaVisitor.java # MiniJava解释器
MiniJavaTest.java # 调用解释器运行所有Sample java
.bat脚本
调试
```
##### 陈啸天
```
Goal.g4	
MainClass.g4	
ClassDeclaration.g4
VarDeclaration.g4	
MethodDeclaration.g4
Type.g4
```
### 平台
```
windows 10
ANTLR4
JAVA

依赖: java环境
并且确保antlr-4.7.1-complete.jar在CLASSPATH路径中
或者在命令行中调用java时,手动添加jar包目录
```
### 运行方式
```
/src/antlr.bat                  #根据.g4文件生成java文件
/src/java/compile.bat           #编译
/src/java/tree.bat              #生成指定java文件的语法树, 如 >tree.bat treevisitor/treevisitor.java
/src/java/RunJavaSamples.bat    #运行所有Sample java文件, 结果保存在out.txt中
/src/SampleMiniJavaPrograms/compile.bat     #编译所有sample MiniJava
/src/SampleMiniJavaPrograms/runall.bat      #运行所有sample MiniJava, 结果保存在out.txt
/src/all in one.bat             #按流程来一遍, 功能见具体代码
```
不能删除上述提到的所有.g4和.java文件(两个). 其他随意