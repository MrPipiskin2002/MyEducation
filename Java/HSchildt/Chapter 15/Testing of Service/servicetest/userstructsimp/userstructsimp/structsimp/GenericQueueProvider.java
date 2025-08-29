package userstructsimp.structsimp;

import userstructs.structs.Structure;

public class GenericQueueProvider implements Structure{
    public <T> GenericQueue<T> getStruct(T[] s) {return new GenericQueue<T>(s);}
}
