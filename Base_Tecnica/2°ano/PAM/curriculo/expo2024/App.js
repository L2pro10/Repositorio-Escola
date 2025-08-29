import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View, ScrollView } from 'react-native';

export default function App() {
  return (
    <View style={styles.container}>
      <ScrollView contentContainerStyle={styles.scrollContainer}>
      <Text style={styles.name}>Nicolas de Campos Annibal</Text>      

      <Text style={styles.sectionTitle}>INFORMAÇÕES PESSOAIS</Text>
      <Text style={styles.info}>Data de Nascimento: 14/07/2008</Text>
        <Text style={styles.info}>Email: coliannibal@gmail.com</Text>
        <Text style={styles.info}>Contato: (11) 91477-8651</Text>
        <Text style={styles.info}>Endereço: Av. do Progresso, 560 - Jardim Marilu</Text>

        <Text style={styles.sectionTitle}>OBJETIVO</Text>
        <Text style={styles.info}>
          Atuar como Jovem Aprendiz.
        </Text>

        <Text style={styles.sectionTitle}>HABILIDADES</Text>
        <Text style={styles.info}>• Facilidade com informáticas.</Text>
        <Text style={styles.info}>• Pacote Office.</Text>
        <Text style={styles.info}>• Facilidade na aprendizagem</Text>
        <Text style={styles.info}>• Facilidade com trabalho em equipe</Text>
        <Text style={styles.info}>• Resolução de problemas de forma lógica e racional.</Text>
        <Text style={styles.info}>• Proatividade.</Text>
        <Text style={styles.info}>• Linguagens de programação(Java, Java Script e suas dependências).</Text>
        <Text style={styles.info}>• Dominio de Front-End, Back-End.</Text>
        <Text style={styles.info}>• Banco de Dados.</Text>
        <Text style={styles.info}>• Design digital.</Text>

        <Text style={styles.sectionTitle}>FORMAÇÃO ACADÊMICA</Text>
        <Text style={styles.info}>• Cursando ensino médio técnico com habilitação profissional em desenvolvimento de sistemas</Text>
        <Text style={styles.info}>• Turno: Matutino.</Text>
        <Text style={styles.info}>• Etec Cidade Tiradentes.</Text>
        <Text style={styles.info}>• Periodo de início: 02/2024</Text>
        <Text style={styles.info}>• Periodo de término: 10/2026</Text>

      </ScrollView>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
  scrollContainer: {
    padding: 30,
    alignItems: 'center',
  },
  name: {
    fontSize: 26,
    fontWeight: 'bold',
    marginBottom: 10,
  },
  title: {
    fontSize: 18,
    fontStyle: 'italic',
    marginBottom: 30,
  },
  sectionTitle: {
    fontSize: 20,
    fontWeight: 'bold',
    marginTop: 20,
    marginBottom: 10,
    alignSelf: 'flex-start',
  },
  info: {
    fontSize: 16,
    marginBottom: 8,
    alignSelf: 'flex-start',
  },
});
