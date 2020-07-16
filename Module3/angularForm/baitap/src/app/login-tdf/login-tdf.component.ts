import { Component, OnInit } from '@angular/core';
import { LoginDTO } from '../dto/login-dto';

@Component({
  selector: 'app-login-tdf',
  templateUrl: './login-tdf.component.html',
  styleUrls: ['./login-tdf.component.scss']
})
export class LoginTdfComponent implements OnInit {

  login = new LoginDTO('', '');
  constructor() { }

  ngOnInit() {
  }

  onSubmit() {
    // console.log(this.login);
  }
  dis(f: any) {
    console.log(f);
  }
}
