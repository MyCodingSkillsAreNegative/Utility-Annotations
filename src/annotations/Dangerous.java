package annotations;

/*
 * @author MyCodingSkillsAreNegative
 * Adds a potentially dangerous warning on an item with a severity tag
 */

public @interface Dangerous {
	String warning();
	int severity();
}
