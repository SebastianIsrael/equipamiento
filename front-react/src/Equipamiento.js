import React from 'react';

async function GetEquipamiento() {
    const api_url = 'URL del back'
    const response = await fetch(api_url)
    const data = await response.json();
    const { id, Name, Description } = data;

    document.getElementById("id").textContent = id;
    document.getElementById("name").textContent = Name;
    document.getElementById("desc").textContent = Description;
    return (
      <ul>
        { this.id}
      </ul>
    )


}

async function GetEquipamientoById(id) {
    const api_url = 'URL del back'
    const response = await fetch(api_url)
    const data = await response.json();
    const foo = data.find(item => item.id === id)
    const { Id, Name, Description } = foo;
    document.getElementById("id").textContent = Id;
    document.getElementById("name").textContent = Name;
    document.getElementById("desc").textContent = Description;
}




GetEquipamiento();
export default GetEquipamiento;