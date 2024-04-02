/*
AMAOEd MIS6232 Computer Programming 2 (Java)

Author: J. E. Cunanan
Student No: 2022-0072254

Laboratory Exercise 007
*/
package Lab007;

public class StudentRecord {

        //these are the attributes
        private String name;
        private double mathGrade;
        private double englishGrade;
        private double scienceGrade;


        //these are the mutators and accessors
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getMathGrade() {
            returnmathGrade;
        }

        public void setMathGrade(double mathGrade) {
            this.mathGrade = mathGrade;
        }

        public double getEnglishGrade() {
            returnenglishGrade;
        }

        public void setEnglishGrade(double englishGrade) {
            this.englishGrade = englishGrade;
        }

        public double getScienceGrade() {
            returnscienceGrade;
        }

        public void setScienceGrade(double scienceGrade) {
            this.scienceGrade = scienceGrade;
        }

        //custom method
        public double computeAverageGrade(){
            return (this.mathGrade + this.englishGrade + this.scienceGrade)/3;
        }

}
