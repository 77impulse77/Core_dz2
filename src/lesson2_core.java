import Exeptions.MyArrayDataException;
import Exeptions.MyArraySizeException;

import java.util.Arrays;

public class lesson2_core {
    public static void main(String[] args) {

        String[][] stringArray =  {   { "1", "2", "3", "4", "1" },
                                      { "3", "4", "5", "6", "1" },
                                      { "3", "5", "5", "6", "1" },
                                      { "3", "4", "5", "8", "1" }
        };
        try {
            int result = array(stringArray);
            System.out.println(" Результат для данного массива = " + result);
        } catch (MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        }



      }

      public static int array(String[][] stringMatrix) throws MyArrayDataException, MyArraySizeException {
        if (stringMatrix.length != 4 || stringMatrix[0].length != 4) {
            throw new MyArraySizeException("ошибка длины массива");
        }

        int sum = 0;
          for (int i = 0; i < stringMatrix.length; i++) {
              for (int j = 0; j < stringMatrix.length; j++){
                  try {
                      sum += Integer.parseInt(stringMatrix[i][j]);
                  } catch (NumberFormatException e) {
                      throw new MyArrayDataException(" Ошибка в строке " +(i+1) +" в столбце " +(j+1));
                  }
             }
          }
          return sum;
      }
    }
//привет

