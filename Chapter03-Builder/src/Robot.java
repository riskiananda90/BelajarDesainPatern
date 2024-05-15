public class Robot {

    private String shield, sword, gun, brainchip;

    public Robot() {
    }

    public String getShield() {
        return shield;
    }

    public void setShield(String shield) {
        this.shield = shield;
    }

    public String getSword() {
        return sword;
    }

    public void setSword(String sword) {
        this.sword = sword;
    }

    public String getGun() {
        return gun;
    }

    public void setGun(String gun) {
        this.gun = gun;
    }

    public String getBrainchip() {
        return brainchip;
    }

    public void setBrainchip(String brainchip) {
        this.brainchip = brainchip;
    }

    @Override
    public String toString() {
        return "Robot Properties"
                + "\n-----------"
                + "\nShield: " + getShield()
                + "\nGun: " + getGun()
                + "\nSword: " + getSword()
                + "\nBrain chip: " + getBrainchip();
    }

}
class RobotBuilder {
    private Robot robot;

    public RobotBuilder() {
        this(new Robot());
    }

    public RobotBuilder(Robot robot) {
        this.robot = robot;
    }

    public RobotBuilder shield(String shield) {
        robot.setShield(shield);
        return this;
    }

    public RobotBuilder gun(String gun) {
        robot.setGun(gun);
        return this;
    }
    public RobotBuilder sword(String sword) {
        robot.setSword(sword);
        return this;
    }
    public RobotBuilder brainchip(String brainchip) {
        robot.setBrainchip(brainchip);
        return this;
    }

    public Robot getResult() {
        return robot;
    }

}

class RobotDirector {

    // Declare Singleton
    private static RobotDirector director = null;

    private RobotDirector() {}

    public static synchronized RobotDirector getInstance() {
        if (director == null) {
            director = new RobotDirector();
        }
        return director;
    }

    public Robot CasualRobot() {
        RobotBuilder builder = new RobotBuilder();
        builder.brainchip("Kasula Brain");
        builder.sword("Taito Ward");
        builder.gun("P30");

        return builder.getResult();
    }

    public Robot IntelligentRobot() {
        RobotBuilder builder = new RobotBuilder();
        builder.brainchip("AI-Powered Brain");
        builder.shield("SAS Shield");
        builder.gun("M1A4 with SmartScope");
        builder.sword("Wielded Blade Arm");

        return builder.getResult();
    }

    public Robot RereRobot() {
        RobotBuilder robotBuilder = new RobotBuilder();
        Robot bot = robotBuilder.brainchip("i3").gun("Desert Eagle").getResult();
        return bot;
    }

}
class Main {

    public static void main(String[] args) {

        // Create a casual robot using RobotDirector
        Robot casualRobot = RobotDirector.getInstance().CasualRobot();
        System.out.println("Casual Robot:");
        System.out.println(casualRobot);
        System.out.println();

        // Create an intelligent robot using RobotDirector
        Robot intelligentRobot = RobotDirector.getInstance().IntelligentRobot();
        System.out.println("Intelligent Robot:");
        System.out.println(intelligentRobot);
        System.out.println();

        // Create a custom robot using RobotBuilder directly
        RobotBuilder robotBuilder = new RobotBuilder();
        Robot customRobot = robotBuilder.brainchip("R-series").sword("Plasma Cutter").gun("EMG Cannon").getResult();
        System.out.println("Custom Robot:");
        System.out.println(customRobot);
    }
}
