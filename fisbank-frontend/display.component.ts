import { Component, OnInit } from '@angular/core';
import { BranchService } from '../branch.service';
@Component({
  selector: 'app-display',
  templateUrl: './display.component.html',
  styleUrls: ['./display.component.css']
})
export class DisplayComponent implements OnInit {

  constructor(private service: BranchService) { }
  cts:any;
  ngOnInit(): void {
    this.service.getAllBranches()
    .subscribe(response =>{
      this.cts=response;
      console.log(response);
    });
    console.log(this.cts);
  }

}
