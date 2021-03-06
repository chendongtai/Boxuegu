package cn.edu.gdmec.android.boxuegu.bean;



public class ExercisesBean {
    public int id;              //每章习题Id
    public String title;        //每章习题标题
    public String content;      //每章习题的数目
    public int background;     //每章习题前边的序号背景
    public int subjectId;      //每章习题的Id
    public String subject;      //每章习题的题干
    public String a;             //每章习题的A选项
    public String b;             //每章习题的B选项
    public String c;             //每章习题的C选项
    public String d;             //每章习题的D选项
    public int answer;          //每道题的正确答案
    /**
     * select为0表示选项是对的，1表示选中A选项是错的，2表示选中B选项是错的，3表示选中C选项是错的，4表示选中D选项是错的
     */
    public int select;
}
