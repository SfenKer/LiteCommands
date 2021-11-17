package dev.rollczi.litecommands;

import dev.rollczi.litecommands.inject.SingleArgumentHandler;
import dev.rollczi.litecommands.valid.ValidationCommandException;

import java.util.List;

public class EmptyTestSenderArgument implements SingleArgumentHandler<EmptyTestSender> {

    @Override
    public EmptyTestSender parse(String argument) throws ValidationCommandException {
        return new EmptyTestSender();
    }

    @Override
    public List<String> tabulation(String command, String[] args) {
        return List.of("test1", "test2", "test3");
    }

}
