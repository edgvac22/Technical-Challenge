#Author: Edgardo Vaca
@stories
Feature: Utest Registration
  As a user, I want to create an account on Utest.com
  @scenario1
  Scenario: Register on the page
    Given than Edgardo wants to create an account on the page
      | strFirstName | strLastName | strEmailAddress | strMonthOfBirth   | strDayOfBirth     | strYearOfBirth    |
      | TuNombre     | TuApellido  | TuCorreo        | TuMesDeNacimiento | TuDiaDeNacimiento | TuAñoDeNacimiento |
    When he start to complete the forms
      | strCity  | strZip          | strOS            | strVersion | strOSLanguage              | strBrand    | strModel | strOSPhone                 | strPassword  | strConfirmPassword  |
      | TuCiudad | TuCodigoPostal  | SistemaOperativo | TuVersion  | LenguajeDeSistemaOperativo | TuMarca     | TuModelo | SistemaOperativoDelCelular | TuContraseña | ConfirmarContraseña |
    Then he create the account
      | strNameStep     |
      | Nombre del paso |