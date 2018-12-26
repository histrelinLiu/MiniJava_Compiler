call antlr.bat
cd java
call compile.bat
call tree.bat binarytree/binarytree.java
call RunJavaSamples.bat
cd ../SampleMiniJavaPrograms
call runall.bat > out.txt
fc out.txt ../java/out.txt
cd ../
notepad java/out.txt