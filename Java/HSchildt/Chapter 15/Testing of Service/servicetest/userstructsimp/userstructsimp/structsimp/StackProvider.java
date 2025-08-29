package userstructsimp.structsimp;

import userstructs.structs.Structure;

public class StackProvider implements Structure{
    public <T> Stack<T> getStruct(T[] s) {return new Stack<T>(s);}
}
