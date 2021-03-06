package com.duyj.designpatterns.behavior.twoclass.command.imp;

import com.duyj.designpatterns.behavior.twoclass.command.AbstarctReceiver;
import com.duyj.designpatterns.behavior.twoclass.command.AbstractCommand;

/**
 * <description>
 *
 * @author 杜永军
 * @date 2018/07/23
 */
public class RunCommand extends AbstractCommand {
    public RunCommand(AbstarctReceiver receiver) {
        super(receiver);
    }

    @Override
    public void action() {
        super.receiver.run();
    }
}
