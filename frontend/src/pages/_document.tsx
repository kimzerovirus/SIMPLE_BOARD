import { Head, Html, Main, NextScript } from 'next/document';

export default function Document() {
	return (
		<Html lang="ko" className="h-full w-full m-0 p-0">
			<Head>
				<title>KIMZEROVIRUS</title>
				<meta charSet="utf-8" />
				<link rel="icon" href="/favicon.ico" />
				<link href="https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css" rel="stylesheet"></link>
			</Head>
			<body className="h-full w-full m-0 p-0 select-none font-sans text-gray-900 antialiased dark:bg-gray-800 dark:text-gray-100 sm:select-auto">
				<Main />
				<NextScript />
			</body>
		</Html>
	);
}