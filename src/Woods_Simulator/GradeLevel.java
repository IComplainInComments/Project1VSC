

/*
    This is an enum that holds the 3 various Grade Level settings.
    These settings determine the features of the application when run.
*/
public enum GradeLevel
{
    GRADES_INVALID,
    GRADES_K_2,
    GRADES_3_5,
    GRADES_6_8
    ;

    // Takes the Number for a Grade (K = 0) and returns the appropriate GradeLevel enum value.
    public static GradeLevel fromGradeInt(int gradeNum)
    {
        switch (gradeNum)
        {
            case 0:
            case 1:
            case 2:
                return GRADES_K_2;
            case 3:
            case 4:
            case 5:
                return GRADES_3_5;
            case 6:
            case 7:
            case 8:
                return GRADES_6_8;
            default:
                return GRADES_INVALID;
        }
    }
    public static int fromIntGrade(GradeLevel grd){
        
        switch(grd){
            case GRADES_K_2:
                return 0;
            case GRADES_3_5:
                return 3;
            case GRADES_6_8:
                return 6;
            default:
                return -1;
            
        }
    }
}
