default: build doc javadoc

build: FORCE
	javac lab2/*.java

javadoc: FORCE
	mkdir javadoc
	cd javadoc; javadoc -charset "UTF-8" -encoding "UTF-8" -docencoding "UTF-8"  ../lab2/*.java


doc: FORCE
	cd doc;\
	pdflatex designbeslut.tex

clean: FORCE
	rm -rf javadoc
	rm -f lab2/*.class
	rm -f designbeslut.aux
	rm -f designbeslut.pdf
	rm -f designbeslut.log
	rm -f designbeslut.bin
run:
	java lab2/Lab2

FORCE:

