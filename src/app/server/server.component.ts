import { Component } from '@angular/core'

@Component({
  selector: 'app-server',
  templateUrl: './server.component.html',
  // template: '<app-server></app-server><app-server></app-server>',
})
export class ServerComponent {
  xxId: number = 10;
  xxStatus: string = 'offline';
  getxxStatus() {
    return this.xxStatus;
  }
}