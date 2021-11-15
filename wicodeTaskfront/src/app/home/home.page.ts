import { Component } from '@angular/core';
import { UserService } from '../api/user.service';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  dataFromService:any = "";
  FirstName:any
  LastName:any
  UserName:any
  Email:any
  Password:any
  Repassword:any

  constructor(public userService:UserService) 
  {

  }

  SaveData(userInfo)
  {

    var DataToSend = {emailId : this.Email,username : this.UserName ,password : this.Password, firstName : this.FirstName , lastName : this.LastName};
    
    if(this.Password == this.Repassword) {
          this.userService.saveData(DataToSend).subscribe(
      (dataReturnFromService)=>{
        this.dataFromService = JSON.stringify
        (dataReturnFromService);
      }
    )
    }
    else {
      window.alert('Passwords do not match!')
    }

  }

}
