package bomb;

import common.IntList;

public class BombMain {
    public static void answers(String[] args) {
        int phase = 2;

        if (args.length > 0) {
            phase = Integer.parseInt(args[0]);
        }
        // TODO: Find the correct inputs (passwords) to each phase using debugging techniques
        Bomb b = new Bomb();
        if (phase >= 0) {
            b.phase0("39291226");
        }
        if (phase >= 1) {
            IntList phase1password = new IntList(0, new IntList(9, new IntList(3, new IntList(0, new IntList(8, null)))));

            b.phase1(phase1password); // Figure this out too
        }
        if (phase >= 2) {
            int passwordNumber = -81201430;
            String passwordString = Integer.toString(passwordNumber);
            b.phase2(passwordString);
        }
    }
}
