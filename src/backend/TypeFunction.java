package backend;

public class TypeFunction extends Type{
	 boolean _defined = false;

    public TypeFunction( Type ret){
		  super("FUNC",-1);
		  _type_expression.addSubType(ret);
    }
	 
    public boolean IsProto(){
		  return !_defined;
    }

    public void Proto2Fonc(){
		  _defined = true;
    }
	
}
