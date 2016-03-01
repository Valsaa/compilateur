SRC=$(wildcard *.vsl)
S=$(SRC:.vsl=.s)
OBJ=$(S:.s=.o)

MIPS : $(S)

%.s: %.vsl
	@echo "MIPS de $^"
	@java -cp /home/heyoen/workspace/antlr-3.4-complete.jar:/home/heyoen/workspace/VSL/bin/ frontend.VslMIPS $^ $@ 

obj : $(OBJ)

%.o: %.s
	@echo "Objet de $^"
	@as $^ -o $@

clean :
	@rm -f *.s
	@rm -f *.o
