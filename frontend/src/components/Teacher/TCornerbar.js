import React from "react";
import "./TCornerbar.css";

export default function profile() {
  const users = JSON.parse(localStorage.getItem("users"));
  console.log(users);
  return (
    <div class="row">
      <div class="profile-nav">
        <div class="panel">
          <div class="user-heading round">
            <a href="#">
              <img src="https://nregsmp.org/eService/images/User.png" alt="" />
            </a>
            <h1>{users.name}</h1>
            <p>{users.email}</p>
          </div>
        </div>
      </div>
    </div>
  );
}
