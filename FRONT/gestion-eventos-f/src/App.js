import React from 'react';
import './App.css';
import { UsuarioService } from './service/UsuarioService'; 
import { DataTable } from 'primereact/datatable';
import { Column } from 'primereact/column';
import { Component } from 'react';

export default class App extends Component{
  constructor() {
    super();
    this.state = {};
    this.usuarioService = new UsuarioService();
  }

  componentDidMount() {
    this.usuarioService.getAll().then(data => this.setState({ usuarios: data }));
  }

  render() {
    return (
      <DataTable value={this.state.usuarios}>
        <Column field="id" header="ID"></Column>
      </DataTable>
    );
  }
}
