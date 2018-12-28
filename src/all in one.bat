call antlr.bat
cd java
call compile.bat
call tree.bat binarytree/binarytree.java
del out.txt
call RunJavaSamples.bat
cd ../SampleMiniJavaPrograms
call compile.bat
del out.txt
call runall.bat > out.txt
@echo on
fc out.txt ../java/out.txt
cd ../
pause