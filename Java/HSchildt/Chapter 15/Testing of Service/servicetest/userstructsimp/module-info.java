module userstructsimp {
    requires userstructs;

    provides userstructs.structs.Structure with
            userstructsimp.structsimp.GenericQueueProvider,
            userstructsimp.structsimp.StackProvider;
}