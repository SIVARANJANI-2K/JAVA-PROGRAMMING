import java.util.ArrayList;
import java.util.Arrays;

class skills implements Cloneable{
      ArrayList<String> techskills;
      ArrayList<String> non_techSkills;
      public skills(ArrayList<String> techskills,ArrayList<String> non_techSkills){
         this.techskills=techskills;
         this.non_techSkills=non_techSkills;
      }
      @Override
      public Object clone() throws CloneNotSupportedException{
         return super.clone();
      }
}
class SkillSetOfTechStaff implements Cloneable{
   String staffID;

   skills skills;
   public void displaySkills(){
      System.out.println("Staff ID : "+staffID+"\nSkills :"+skills.techskills+"\t"+skills.non_techSkills);
   }
   @Override
   protected Object clone() throws CloneNotSupportedException{
         return super.clone();
      }
}


public class ShallowDeepClone_3045 {
    public static void main(String[] args) throws CloneNotSupportedException{
      SkillSetOfTechStaff OriginalStaff =new SkillSetOfTechStaff();
      OriginalStaff.staffID="TS00374";
      OriginalStaff.skills=new skills(new ArrayList<>(Arrays.asList("Operating System","DBMS","DSA","JAVA","C++")),new ArrayList<>(Arrays.asList("Communication","Critical Thinking")));
      SkillSetOfTechStaff ShallowCopyStaff=(SkillSetOfTechStaff)OriginalStaff.clone();
      System.out.println("Original  TechStaff : ");
      OriginalStaff.displaySkills();
      System.out.println();
      System.out.println("Shallow Copied : ");
      ShallowCopyStaff.displaySkills();
      System.out.println("Equality of original staff and shallow copied staff : "+(OriginalStaff==ShallowCopyStaff));
      System.out.println("Equality of skillset object in shallow and original : "+(OriginalStaff.skills==ShallowCopyStaff.skills));
      System.out.println("-----------------------------------------------------------------------------------------------");
      SkillSetOfTechStaff DeepCopyStaff=(SkillSetOfTechStaff)OriginalStaff.clone();
      DeepCopyStaff.skills=(skills)OriginalStaff.skills.clone();
      System.out.println("Original  TechStaff : ");
      OriginalStaff.displaySkills();
      System.out.println();
      System.out.println("Deep Copied : ");
      ShallowCopyStaff.displaySkills();
      System.out.println("Equality of original staff and Deep copied staff : "+(OriginalStaff==DeepCopyStaff));
      System.out.println("Equality of skillset object in Deep and original : "+(OriginalStaff.skills==DeepCopyStaff.skills));

    }
}
