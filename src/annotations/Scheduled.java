package annotations;

/*
 * @author MyCodingSkillsAreNegative
 * Writes a scheduled task with a version
 */

public @interface Scheduled {
	String ScheduledTask();
	String version();
}
